package com.example.spring20230920;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring20230920ApplicationTests {

    @Test
    void contextLoads() {
    }

    class Solution {
        public int solution(int[] number) {
            int count = 0;
            for (int i = 0; i < number.length-3; i++) {
                for (int j = i+1; j < number.length-2; j++) {
                    for (int k = j+1; j < number.length-1; k++) {
                        if (number[i] + number[j] + number[k] == 0) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }
    }

}
