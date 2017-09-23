package com.net.Logic;

import com.net.model.User;
import com.net.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDoingSomething {

    private static final Logger log = Logger.getLogger(UserDoingSomething.class);

    @Autowired
    private UserService userService;

    public void registration(User user) {
        boolean b = userService.validateUser(user);
        log.info(user+" "+b);
    }


}
