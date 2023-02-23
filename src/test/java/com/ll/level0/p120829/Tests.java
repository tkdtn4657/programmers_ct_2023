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

    @Test
    @DisplayName("90일 때 2")
    void t2(){
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }

    @Test
    @DisplayName("101일 때 3")
    void t3(){
        assertThat(new Solution().solution(101)).isEqualTo(3);
    }

    @Test
    @DisplayName("180일 때 4")
    void t4(){
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}
