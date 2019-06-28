/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.gremlin.neo4j;

import java.util.Map;
import org.apache.tinkerpop.gremlin.LoadGraphWith;
import org.apache.tinkerpop.gremlin.neo4j.structure.Neo4jGraph;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class ListPropertyNeo4jGraphProvider extends NoMultiNoMetaNeo4jGraphProvider {
    @Override
    public Map<String, Object> getBaseConfiguration(final String graphName, final Class<?> test, final String testMethodName, final LoadGraphWith.GraphData graphData) {
        Map<String, Object> config = super.getBaseConfiguration(graphName, test, testMethodName, graphData);
        config.put(Neo4jGraph.CONFIG_LISTS_TO_ARRAYS, true);
        return config;
    }
}
