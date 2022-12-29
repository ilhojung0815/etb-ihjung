package com.emptybeer.etb.controllers;

import com.emptybeer.etb.entities.bbs.FestivalArticleEntity;
import com.emptybeer.etb.entities.bbs.ImageEntity;
import com.emptybeer.etb.services.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller(value = "com.emptybeer.etb.controllers.HomeController")
@RequestMapping(value = "/")
public class HomeController {
    private final BbsService bbsService;

    @Autowired
    public HomeController(BbsService bbsService) {
        this.bbsService = bbsService;
    }

    @GetMapping(value = "/",
            produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("home/index");
        return modelAndView;
    }

    @GetMapping(value = "product",
            produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getProduct() {
        ModelAndView modelAndView = new ModelAndView("home/product");
        return modelAndView;
    }


    @GetMapping(value = "community",
            produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getCommunity() {
        ModelAndView modelAndView = new ModelAndView("home/community");
        return modelAndView;
    }



    // 이미지의 갯수만큼 grid로 나열하기 위해 bbsService맵퍼를 이용
    @GetMapping(value = "festival",
            produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getFestival() {
        ModelAndView modelAndView = new ModelAndView("home/festival");

//        modelAndView.addObject("festivalArticles", this.bbsService.getFestivalArticle());


        return modelAndView;
    }

    //이미지를 위해 다중매핑을 사용한다.

//    @GetMapping(value="image", produces = MediaType.IMAGE_JPEG_VALUE)
//    public ResponseEntity<byte[]> getImage(@RequestParam(value = "index")int index) throws IOException {
//
//        ImageEntity image = this.bbsService.getImage(index);
//        HttpHeaders headers = new HttpHeaders();
//
//        // 헤더의 컨텐트 타입이 무엇을 받을지를 결정한다.(추후 해당 키워드 검색)
//        headers.add("Content-Type", image.getFileMime());
//        return new ResponseEntity<>(image.getData(), headers, HttpStatus.OK);
//    }

}

