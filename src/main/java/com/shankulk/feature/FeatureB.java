package com.shankulk.feature;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "feature-b.enabled", havingValue = "true")
public class FeatureB extends AbstractFeature {

    @Override
    public void display() {
        System.out.println("Feature B display called");
    }

}
