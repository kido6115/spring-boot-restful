package com.sungyeh.service.Impl;

import com.sungyeh.service.FooService;
import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {
    @Override
    public boolean getStatus(boolean status) {
        boolean returnBoolean;
        if(status){
            returnBoolean= false;
        }else{
            returnBoolean=true;
        }
        return returnBoolean;
    }
}
