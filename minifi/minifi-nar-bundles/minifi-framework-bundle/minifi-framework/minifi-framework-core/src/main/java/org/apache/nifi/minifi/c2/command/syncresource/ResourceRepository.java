/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.minifi.c2.command.syncresource;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import org.apache.nifi.c2.protocol.api.ResourcesGlobalHash;
import org.apache.nifi.c2.protocol.api.ResourceItem;

public interface ResourceRepository {

    ResourcesGlobalHash findResourcesGlobalHash();

    Optional<ResourcesGlobalHash> saveResourcesGlobalHash(ResourcesGlobalHash resourcesGlobalHash);

    List<ResourceItem> findAllResourceItems();

    boolean resourceItemBinaryPresent(ResourceItem resourceItem);

    Optional<ResourceItem> addResourceItem(ResourceItem resourceItem);

    Optional<ResourceItem> addResourceItem(ResourceItem resourceItem, Path source);

    Optional<ResourceItem> deleteResourceItem(ResourceItem resourceItem);
    Optional<Path> getAbsolutePath(String resourceId);

}
