package com.shankulk.feature;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "feature-a.enabled", havingValue = "true")
public class FeatureA extends AbstractFeature {

    @Override
    public void display() {
        System.out.println("Feature A display called");
    }
}
