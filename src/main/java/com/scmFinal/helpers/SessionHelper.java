package com.scmFinal.helpers;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpSession;

// jo bhi message aya hai, ek baar display hone k baad apne aap hataane k liye ye banaya h
@Component
public class SessionHelper {

    public static void removeMessage() {
        try {
            System.out.println("removing message from session");
            // jb session milega, tbhi message object ko remove krskte h
            // phle ServletRequestAttributes me convert krege, uske baad getRequestAttributes lgaa skte h
            HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest()
                    .getSession();
            session.removeAttribute("message");
        } catch (Exception e) {
            System.out.println("Error in SessionHelper: " + e);
            ;
            e.printStackTrace();
        }

    }

}
