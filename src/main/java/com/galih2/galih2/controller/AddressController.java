//package com.galih2.galih2.controller;
//
//import com.galih2.galih2.model.Address;
//import com.galih2.galih2.model.User;
//import com.galih2.galih2.repository.AddressRepository;
//import com.galih2.galih2.repository.UserRepository;
//import com.galih2.galih2.service.AddressService;
//import com.galih2.galih2.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("api/address")
//public class AddressController {
//    @Autowired
//    AddressService service;
//    @Autowired
//    AddressRepository addressRepository;
//
////    @GetMapping("getByaddress")
////    Address findByaddress(@RequestParam String address) {
////        Address result = service.findByAddress(address);
////        return result;
////    }
////
////    @DeleteMapping("/delete")
////    Map<String, Object> hapusData(@RequestParam int id) {
////        Map<String, Object> result = new HashMap<>();
////        if (service.hapusData(id)) {
////            result.put("success", true);
////        } else {
////            result.put("success", false);
////
////        }
////        return result;
////    }
////
////    @PutMapping("/update")
////    Map<String, Object> UpdateAddress(@RequestBody Address body) {
////        Map<String, Object> result = new HashMap<>();
////        if (service.updateAddress(body)) {
////            result.put("success", true);
////            result.put("mes", "berhasil");
////        } else {
////            result.put("success", false);
////            result.put("mes", "gagal");
////        }
////        return result;
////    }
//
//    @PostMapping("/insert")
//    Address insert(@RequestBody Address body) {
//        Address result = addressRepository.save(body);
//        return result;
//    }
//}
