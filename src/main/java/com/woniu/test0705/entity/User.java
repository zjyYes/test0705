package com.woniu.test0705.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Create on 2021/7/5
 *
 * @author eli
 * @date 2021年07月05日13:53
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer uid;
    private String uname;
    private String upwd;
}
