/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.wsscalculator;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;

/**
 * The implementation of the CalculatorService
 */
@WebService(serviceName = "WssCalculatorService", portName = "WssCalculator", name = "WssCalculator", endpointInterface = "org.jboss.as.quickstarts.wsscalculator.WssCalculatorService", targetNamespace = WssCalculatorService.TARGET_NS)
@InInterceptors(interceptors = {"org.jboss.as.quickstarts.wsscalculator.WSSInterceptor"})
@org.apache.cxf.feature.Features (features = "org.apache.cxf.feature.LoggingFeature")
public class WssCalculatorServiceImpl implements WssCalculatorService {

    @Override
    public int modulo(int a, int b) {
        return a % b;
    }
}
