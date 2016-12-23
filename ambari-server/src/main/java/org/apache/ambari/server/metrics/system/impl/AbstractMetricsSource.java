/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.metrics.system.impl;

import java.util.List;

import org.apache.ambari.server.metrics.system.MetricsSink;
import org.apache.ambari.server.metrics.system.MetricsSource;
import org.apache.ambari.server.metrics.system.SingleMetric;

public abstract class AbstractMetricsSource implements MetricsSource {
  protected MetricsSink sink;

  /**
   *  Pass metrics sink to metrics source
   **/
  @Override
  public void init(MetricsConfiguration configuration, MetricsSink sink) {
    this.sink = sink;
  }

  /**
   *  Get metrics at the instance
   *  @return a map for metrics that maps metrics name to metrics value
   **/
  abstract public List<SingleMetric> getMetrics();
}