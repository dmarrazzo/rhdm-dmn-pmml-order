package com.demo;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieRuntimeFactory;
import org.kie.dmn.api.core.DMNContext;
import org.kie.dmn.api.core.DMNModel;
import org.kie.dmn.api.core.DMNResult;
import org.kie.dmn.api.core.DMNRuntime;

public class LocalTest {
    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kcontainer = ks.getKieClasspathContainer();
        DMNRuntime dmnRuntime = KieRuntimeFactory.of(kcontainer.getKieBase()).get(DMNRuntime.class);
        DMNModel dmnModel = dmnRuntime.getModels().get(0);
        DMNContext context = dmnRuntime.newContext();

        Map<String,Object> orderInfo = new HashMap<>();
        orderInfo.put("price", 1001);
        orderInfo.put("productType", "phone");
        orderInfo.put("urgency", "low");
        orderInfo.put("category", "basic");

        context.set("order info", orderInfo );

        DMNResult result = dmnRuntime.evaluateAll(dmnModel, context);

        System.out.println(result);
 
    }
}