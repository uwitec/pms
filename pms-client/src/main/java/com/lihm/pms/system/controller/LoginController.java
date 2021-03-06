package com.lihm.pms.system.controller;

import com.lihm.pms.system.service.adminManager.impl.AdminManagerServiceImpl;
import com.lihm.pms.system.util.Result;
import com.lihm.pms.system.vo.user.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/index")
public class LoginController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private AdminManagerServiceImpl adminManagerService;
	
	@RequestMapping("/login")
	@ResponseBody
	public Result<String> index( String username, String password){
		LOGGER.info("**********");

		Result<String> result = new Result(Result.Type.FAILURE);
		AdminVo vo = adminManagerService.getAdminInfoByCode(username);
		if (null == vo){
			result.addMessage("账号不存在！！");
			return result;
		}

		if (!StringUtils.isEmpty(password) && password.equals(vo.getPassword())){
			result.setType(Result.Type.SUCCESS);
			result.addMessage("登陆成功！！");
		}else{
			result.addMessage("账号或密码错误！！");
		}
		return result;
	}

}
