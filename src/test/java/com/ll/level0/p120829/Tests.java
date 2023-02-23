package com.ll.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("55일때 1을 출력하는 값")

    void t1(){
        assertThat(new Solution().solution(55)).isEqualTo(1);
    }

}
