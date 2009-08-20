/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.felix.sigil.eclipse.runtime;

import java.util.Properties;

import org.apache.felix.sigil.common.runtime.Runtime;
import org.apache.felix.sigil.eclipse.install.IOSGiInstall;
import org.eclipse.debug.core.ILaunchConfiguration;

public class LaunchHelper {

	public static IOSGiInstall getInstall(ILaunchConfiguration config) {
//	    OSGiInstall install = new OSGiInstall( "felix" );
//	    OSGiInstallType type = new OSGiInstallType();
//	    type.setMainClass( "org.apache.felix.main.Main" );
//	    type.setClassPath( new String[] { "/Users/dave/development/felix-trunk/main/target/org.apache.felix.main-1.9.0-SNAPSHOT.jar" } );
//	    install.setType( type );
//		return install;
	    return null;
	}

    public static int getRetries( ILaunchConfiguration config )
    {
        return 5;
    }

    public static Properties buildClientProps( ILaunchConfiguration config )
    {
        Properties props = new Properties();
        props.put( Runtime.ADDRESS_PROPERTY, "localhost" );
        props.put( Runtime.PORT_PROPERTY, "9090" );
        return props;
    }

    public static String[] getProgramArgs( ILaunchConfiguration config )
    {
        return new String[] { "-p", "9090", "-a", "localhost" };
    }

    public static long getBackoff( ILaunchConfiguration config )
    {
        return 1000;
    }
}
