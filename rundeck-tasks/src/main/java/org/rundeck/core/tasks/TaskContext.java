/*
 * Copyright 2018 Rundeck, Inc. (http://rundeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rundeck.core.tasks;

import com.dtolabs.rundeck.core.authorization.AuthContext;
import com.dtolabs.rundeck.core.common.IFramework;
import com.dtolabs.rundeck.core.jobs.JobService;
import com.dtolabs.rundeck.core.storage.StorageTree;

/**
 * Basis for context information for tasks
 */
public interface TaskContext {
    /**
     * @return task ID
     */
    String getTaskId();

    /**
     * @return project name
     */
    String getProject();

    /**
     *
     * @return server node UUID
     */
    String getServerNodeUUID();

    /**
     * @return the framework
     */
    public IFramework getFramework();

    /**
     * @return the authorization context
     */
    public AuthContext getAuthContext();
    /**
     * @return the storage service
     */
    public StorageTree getStorageTree();
    /**
     * @return the job service
     */
    public JobService getJobService();
}
