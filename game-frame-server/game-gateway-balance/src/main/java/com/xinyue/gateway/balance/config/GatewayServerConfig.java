package com.xinyue.gateway.balance.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.xinyue.gateway.balance.model.GatewayServerInfo;

@Configuration
@ConfigurationProperties(prefix = "gateway.server.config")
public class GatewayServerConfig {

	private List<GatewayServerInfo> gatewayServer;

	public List<GatewayServerInfo> getGatewayServer() {
		return gatewayServer;
	}

	public void setGatewayServer(List<GatewayServerInfo> gatewayServer) {
		this.gatewayServer = gatewayServer;
	}

	@Override
	public String toString() {
		return "GatewayServerConfig [gatewayServer=" + gatewayServer + "]";
	}

}