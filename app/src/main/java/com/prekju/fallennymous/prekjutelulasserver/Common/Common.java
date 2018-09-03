package com.prekju.fallennymous.prekjutelulasserver.Common;

import com.prekju.fallennymous.prekjutelulasserver.Model.User;

/**
 * Created by fallennymous on 14/08/2018.
 */


    public class Common {
        public static User currentUser;

        public static final String UPDATE = "Update";
        public static final String DELETE = "Delete";

        // Request to upload image
        public static final int PICK_IMAGE_REQUEST = 71;

        public static String convertCodeStatus(String code){
            if (code.equals("0"))
                return "Ditempat";
            else if (code.equals("1"))
                return "Dalam Perjalanan";
            else
                return "Dikirim";
        }
    }


