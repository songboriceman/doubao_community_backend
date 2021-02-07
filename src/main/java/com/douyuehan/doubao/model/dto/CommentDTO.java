package com.douyuehan.doubao.model.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class CommentDTO implements Serializable {
    private static final long serialVersionUID = -5957433707110390852L;


    private String topic_id;

    /**
     * 内容
     */
    private String content;



}
