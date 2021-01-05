/*
 * Copyright 2020 NAVER Corp.
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

package com.navercorp.pinpoint.bootstrap;

import com.navercorp.pinpoint.bootstrap.agentdir.Assert;

/**
 * @author Woonduk Kang(emeroad)
 */
public class AgentIds {
    private final String agentId;
    private final String applicationName;

    public AgentIds(String agentId, String applicationName) {
        this.agentId = Assert.requireNonNull(agentId, "agentId");
        this.applicationName = Assert.requireNonNull(applicationName, "applicationName");
    }


    public String getAgentId() {
        return agentId;
    }

    public String getApplicationName() {
        return applicationName;
    }
}
