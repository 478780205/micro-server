package com.oath.micro.server.jackson;


import com.oath.cyclops.jackson.CyclopsModule;
import com.oath.micro.server.Plugin;
import com.oath.micro.server.rest.jackson.JacksonFeature;
import com.fasterxml.jackson.databind.Module;
import cyclops.reactive.collections.mutable.SetX;

import java.util.Set;

public class JacksonPlugin implements Plugin {

    @Override
    public Set<Class<?>> jaxRsResources() {

        return SetX.of(JacksonFeature.class);

    }

    @Override
    public Set<Class> springClasses() {

        return SetX.of(CoreJacksonConfigurator.class, JacksonConfigurers.class);

    }

    @Override
    public Set<Module> jacksonModules() {
        return SetX.of(new CyclopsModule());
    }

}
