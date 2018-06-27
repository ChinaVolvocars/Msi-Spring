package com.msi.admin.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/main")
public class MainController extends BaseController {


//  @Autowired


  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @ResponseBody
  public JSONPObject login(String userName, String userPasswor, HttpServletRequest servletRequest) {
    //
    return null;
  }

}
