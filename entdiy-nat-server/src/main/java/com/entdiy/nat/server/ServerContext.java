/**
 * Copyright @ 2020-2020 EntDIY-NAT (like Ngrok) based on Netty
 *
 * Author: Li Xia, E-Mail: xautlx@hotmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.entdiy.nat.server;

import com.entdiy.nat.server.config.NatServerConfigProperties;
import com.entdiy.nat.server.service.ControlService;
import org.springframework.context.ApplicationContext;

public class ServerContext {

    private static ApplicationContext applicationContext;
    private static NatServerConfigProperties config;

    public static void setApplicationContext(ApplicationContext applicationContext) {
        ServerContext.applicationContext = applicationContext;
    }

    public static void setConfig(NatServerConfigProperties config) {
        ServerContext.config = config;
    }

    public static NatServerConfigProperties getConfig() {
        return config;
    }

    public static ControlService getControlService() {
        return applicationContext.getBean(ControlService.class);
    }
}
