package de.fhws.applab.restdemo.integration;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Before;
import org.junit.Test;

public class SimpleHttpTest {

	protected String url;

	@Before
	public void startup() {
		try {
			InputStream is = this.getClass().getResourceAsStream(
					"url.properties");
			Properties props = new Properties();
			props.load(is);
			this.url = props.getProperty("url");
		} catch (IOException e) {
			this.url = null;
			e.printStackTrace();
		}
	}

	@Test
	public void test1() throws Exception {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(this.url + "/demo/ping");
		CloseableHttpResponse response1 = httpclient.execute(httpGet);

		try {
			StatusLine status = response1.getStatusLine();
			assertEquals(HttpStatus.SC_OK, status.getStatusCode());

			HttpEntity entity1 = response1.getEntity();
			String text = EntityUtils.toString(entity1);
			assertEquals("OK", text);

			EntityUtils.consume(entity1);
		} finally {
			response1.close();
		}
	}

}
