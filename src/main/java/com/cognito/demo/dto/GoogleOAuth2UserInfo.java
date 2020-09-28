package com.cognito.demo.dto;


import lombok.Data;

@Data
public class GoogleOAuth2UserInfo {

    private String id;
    private String name;
    private String email;
    private String imageUrl;


}
