<!-- 
/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bean Validation : Methods Validation</title>
    </head>
    <body>

        <h1>Bean Validation : Methods Validation</h1>

        <form method="post" action="${pageContext.request.contextPath}/TestServlet">
            <table border="0" cellpadding="5" cellspacing="0">
                <tr>
                    <td>
                        Please Select Validation Example : 
                    </td>
                    <td>
                        <select name="type" style="width: 200px">
                            <option value="1">Say Hello Example</option>
                            <option value="2">Date Validation Example</option>
                            <option value="3">List Validation Example</option>
                            <option value="4">Parameter Injection Validation Example (Invalid)</option>
                            <option value="5">Parameter Injection Validation Example (Valid)</option>
                        </select>
                    </td>
                <tr/>
                <tr>
                    <td>
                        Enter Name :
                    </td>
                    <td>
                        <input type="text" style="width: 200px" name="name"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Select Date : 
                    </td>
                    <td>
                        <input type="date" name="date" style="width: 200px"/><br/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Select List Size : 
                    </td>
                    <td>
                        <select name="list_size" style="width: 200px">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="3">3</option>
                            <option value="30">30</option>
                        </select>
                    </td>
                </tr>
                
            </table>
            <br/>
            <br/>
            <input type="submit" value="Validate"/>
        </form>

    </body>
</html>
