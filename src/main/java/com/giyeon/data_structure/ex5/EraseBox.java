package com.giyeon.data_structure.ex5;

public class EraseBox<T> {

    public boolean instanceCheck(Object object) {
        return object instanceof Object;
    }

    // 런타임시에는 위와같이 코드가 바뀌기 때문에 항상 참이 나오고 자바는 이러한 상황을 개발자가 의도하지 않았다는 것을 알기에
    // 이렇게 하는것을 컴파일 오류를 낸다.


}
