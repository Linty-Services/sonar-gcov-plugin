 /*
 * sonar-coverage-ghdl plugin for Sonarqube & GHDL
 * Copyright (C) 2019 Linty Services
 * 
 * Based on :
 *  SonarQube Cobertura Plugin
 * Copyright (C) 2018-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.sonar.plugins.gcov;

import org.junit.Test;
import org.sonar.api.Plugin;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;
import org.sonar.plugins.gcov.GcovPlugin;

import static org.fest.assertions.Assertions.assertThat;

public class GcovPluginTest {

    private static final Version VERSION_6_7 = Version.create(6, 7);
    private GcovPlugin gcovPlugin = new GcovPlugin();

    @Test
    public void testGetExtensions(){
        SonarRuntime sonarRuntime = SonarRuntimeImpl.forSonarQube(VERSION_6_7, SonarQubeSide.SERVER);
        Plugin.Context context = new Plugin.Context(sonarRuntime);
        gcovPlugin.define(context);
        assertThat(context.getExtensions()).hasSize(2);
    }
}
