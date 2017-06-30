package com.example.demo.controllers;

import com.example.demo.dto.FlatDto;
import com.example.demo.model.Customer;
import com.example.demo.model.Flat;
import com.example.demo.repository.FlatRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

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
            Date date = new Date();
            System.out.println(date);
            String format = simpleDateFormat.format(date);
        }

        return resultList;

    }

    @RequestMapping(value = "/flat/{id}", produces = "application/xml")
    public FlatDto getSingleFlat(@PathVariable("id") Integer id){
        Flat one = flatRepository.findOne(id);
        ModelMapper modelMapper = new ModelMapper();
        FlatDto map = modelMapper.map(one, FlatDto.class);
        return map;

    }

    @RequestMapping(value = "/flat/add", method = RequestMethod.POST)
    public String uploadData(ModelMap modelMap, @RequestBody FlatDto flatDto){
        Flat flat = new Flat();

        flatRepository.save(flat);

        return "Success";
    }


    public void testXml(){
        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("aaaa");
        customer.setAge(29);

//        try {
//
//            File file = new File("C:\\file.xml");
//            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
//            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//            // output pretty printed
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            jaxbMarshaller.marshal(customer, file);
//            jaxbMarshaller.marshal(customer, System.out);
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
    }

}
