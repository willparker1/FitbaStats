package com.porkerspicks.fitbastats.apisports;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "apiFootball", url = "https://v3.football.api-sports.io")
public interface ApiFootball {

//    @RequestMapping(method = RequestMethod.GET, value = "/posts")
//    List<Post> getPosts();
//
//    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
//    Post getPostById(@PathVariable("postId") Long postId);
}
