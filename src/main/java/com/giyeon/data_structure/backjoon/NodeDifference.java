package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class NodeDifference {
    private static HashMap<Integer, ArrayList<Integer>> levelAndNodeRootNum = new HashMap<>();
    private static HashMap<Integer, Integer> nodeDifferencesByEachLevel = new HashMap<>();
    private static ArrayList<Integer> bucketOfWholeNode = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopNum = Integer.parseInt(br.readLine());
        Node firstNode = null;

        for (int i = 0; i < loopNum; i++) {

            if (i == 0) {
                String[] RootLeftRight = br.readLine().split(" ");
                int root = Integer.parseInt(RootLeftRight[0]);
                int left = Integer.parseInt(RootLeftRight[1]);
                int right = Integer.parseInt(RootLeftRight[2]);
                firstNode = new Node(root, 1, null, null);
                insertNode(firstNode, root, left, right);
            }else {
                String[] RootLeftRight = br.readLine().split(" ");
                int root = Integer.parseInt(RootLeftRight[0]);
                int left = Integer.parseInt(RootLeftRight[1]);
                int right = Integer.parseInt(RootLeftRight[2]);
                insertNode(firstNode, root, left, right);
            }

        }

        //키별로 숫자 찾고 가장 큰 숫자,가장 작은 숫자 노드의 위치차이 구해서 레벨별 위치차이 구할것이다.
        getDifferencesByLevel(levelAndNodeRootNum.keySet().size(),firstNode);
        int biggestDifference = 0;
        int level = 0;

        for (int i = 2; i < nodeDifferencesByEachLevel.size()+2; i++) {
            Integer difference = nodeDifferencesByEachLevel.get(i);
            if(difference>biggestDifference) {
                biggestDifference = difference;
                level = i;
            }
        }
        String result = level + " " + biggestDifference;
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void getDifferencesByLevel(int keySize,Node node) {
        for (int i = 2; i < keySize + 2; i++) {
            ArrayList<Integer> numberCollection = levelAndNodeRootNum.get(i);
            Collections.sort(numberCollection);
            int lowestNum = numberCollection.get(0);
            int highestNum = numberCollection.get(numberCollection.size() - 1);
            getNodeSequence(node);
            int lowestNumLocation = 0;
            int highestNumLocation= 0;

            for (int j = 0; j <bucketOfWholeNode.size(); j++) {
                if (lowestNum == bucketOfWholeNode.get(j)) {
                    lowestNumLocation = j + 1;
                }
                if (highestNum == bucketOfWholeNode.get(j)) {
                    highestNumLocation = j + 1;
                }
            }
            nodeDifferencesByEachLevel.put(i, highestNumLocation - lowestNumLocation+1);
        }
    }

    private static void getNodeSequence(Node node) {
        if (node.getLeftNode() != null) {
            getNodeSequence(node.getLeftNode());
        }
        bucketOfWholeNode.add(node.getRoot());
        if (node.getRightNode() != null) {
            getNodeSequence(node.getRightNode());
        }
    }

    private static void insertNode(Node node, int root, int left, int right) {

        if (node.getRoot() == root) {
            if (left != -1) {
                node.setLeftNode(new Node(left, node.getLevel() + 1, null, null));
                updateHashMapWithLevelAndNum(node, left);
            }
            if (right != -1) {
                node.setRightNode(new Node(right, node.getLevel() + 1, null, null));
                updateHashMapWithLevelAndNum(node, right);
            }
            return;
        }
        if(node.getLeftNode() != null) {
            insertNode(node.getLeftNode(), root, left, right);
        }
        if (node.getRightNode() != null) {
            insertNode(node.getRightNode(), root, left, right);
        }
    }

    private static void updateHashMapWithLevelAndNum(Node node, int leftOrRight) {
        if(levelAndNodeRootNum.containsKey(node.getLevel() + 1)) {
            levelAndNodeRootNum.get(node.getLevel() + 1).add(leftOrRight);
        }else{
            levelAndNodeRootNum.put(node.getLevel() + 1, new ArrayList<>());
            levelAndNodeRootNum.get(node.getLevel() + 1).add(leftOrRight);
        }
    }

    static class Node {
        int root;
        int level;
        Node leftNode;
        Node rightNode;

        public Node(int root, int level, Node leftNode, Node rightNode) {
            this.root = root;
            this.level = level;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public int getRoot() {
            return root;
        }

        public int getLevel() {
            return level;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRoot(int root) {
            this.root = root;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
    }
}
