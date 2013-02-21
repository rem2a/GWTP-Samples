/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.samples.mobile.client.gin;

import com.gwtplatform.dispatch.client.RemoteServerUrl;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.samples.mobile.client.application.ApplicationMobileModule;

public class PhoneGapModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindConstant().annotatedWith(RemoteServerUrl.class).to("http://localhost:8080/");

        install(new MobileModule());
        install(new SharedModule());
    }
}