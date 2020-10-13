package com.hjy.hera.map.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.hjy.hera.map.dao.SpotDao;
import com.hjy.hera.map.pojo.Spot;
import org.geolatte.geom.MultiPolygon;
import org.geolatte.geom.codec.Wkt;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class SpotController {


    @Resource
    private SpotDao spotDao;

    @GetMapping("/test")
    public Spot test(){
        Spot spot = spotDao.getOne(1);
//        Spot spot1 = new Spot();
//        MultiPolygon multiPolygon = (MultiPolygon) Wkt.fromWkt("MULTIPOLYGON(((111.31238284854992 27.033089025178295,111.31232638035495 27.03303055294651,111.31265876801854 27.032698503361438,111.31280240323137 27.032811606033853,111.31249896435364 27.033145408395747,111.31255907238965 27.03317459582206,111.31289415681105 27.032853882148885,111.31272842762945 27.03270620477054,111.31287750966983 27.032619911684627,111.31298394227949 27.032538488326647,111.31287170101271 27.032448000056323,111.31280241341413 27.032462481003318,111.31236608350011 27.03281207400811,111.31217453632152 27.032970095578644,111.31201521025382 27.033209232234015,111.31177055692498 27.03344855771129,111.31149416769348 27.033783465812576,111.31122337442709 27.034213874713046,111.3110804240774 27.034591468702086,111.31083230088802 27.035508944459753,111.31080240691668 27.03627311644627,111.31106472571734 27.03663548792579,111.31145506597235 27.037007125773492,111.31151903632147 27.036997433203112,111.31155627579116 27.03696392090239,111.31158236067442 27.036753734688556,111.31166168487127 27.03650999981093,111.31188411525827 27.03594597872416,111.31205342553969 27.035458485804153,111.3121540526484 27.035205152379937,111.31229717090491 27.034889640796298,111.31263197114197 27.03446386370166,111.31271146248761 27.03428221162819,111.31292897373665 27.03387102128465,111.31281684869339 27.033822940560167,111.31261801475796 27.034238865213595,111.31231518739702 27.034655020340196,111.31207228412853 27.035045970002333,111.31192347455203 27.035521812474826,111.3117476954159 27.035984486763542,111.31158851190273 27.036277109278213,111.31148911491982 27.036590612794484,111.3114639116787 27.036733939092255,111.31145343568271 27.03680273169147,111.31144281735826 27.036819947540838,111.31142148482097 27.036819994740213,111.31137449040428 27.036797175566953,111.31133166827375 27.03673996243987,111.31114453703712 27.036568451764147,111.31094641174245 27.036277574358294,111.31094593812279 27.036105650936623,111.31106655722786 27.035365156420898,111.31118741278789 27.03471062391399,111.31152165000415 27.03407949626821,111.31179253414392 27.033682516487083,111.31217551358883 27.033323492581243,111.31238284854992 27.033089025178295)))");
//        spot1.setGeom(multiPolygon);
//
//        spotDao.save(spot1);
        return spot;
    }
}
