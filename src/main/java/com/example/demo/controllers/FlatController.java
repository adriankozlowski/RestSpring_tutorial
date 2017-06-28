package com.example.demo.controllers;

import com.example.demo.dto.FlatDto;
import com.example.demo.model.Flat;
import com.example.demo.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Adrian on 28.06.2017.
 */
@RestController
public class FlatController {

    @Autowired
    private FlatRepository flatRepository;

    @RequestMapping("/flats")
    public List<FlatDto> getFlats(){
        List<Flat> all = flatRepository.findAll();
        ArrayList<FlatDto> resultList = new ArrayList<FlatDto>();
        for (Flat flat : all) {
            FlatDto flatDto = new FlatDto();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            flatDto.setAdded(simpleDateFormat.format(flat.getAdded()));
            flatDto.setModified(simpleDateFormat.format(flat.getModified()));
            resultList.add(flatDto);
        }

        return resultList;

    }

    @RequestMapping("/flat/{id}")
    public Flat getSingleFlat(@PathVariable("id") Integer id){

        return flatRepository.findOne(id);

    }

    @RequestMapping(value = "/flat/add", method = RequestMethod.POST)
    public String uploadData(ModelMap modelMap, @RequestBody FlatDto flatDto){
        Flat flat = new Flat();

        flatRepository.save(flat);

        return "Success";
    }

}
