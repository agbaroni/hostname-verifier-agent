package com.github.agbaroni.agents;

import javax.net.ssl.HttpsURLConnection;

public class DisableHostnameVerifier {
    public static void premain(String agentArgs) {
        HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
	System.out.println("!!! AN AGENT CHANGED TLS HOSTNAME VERIFICATION RULES !!!");
    }
}
