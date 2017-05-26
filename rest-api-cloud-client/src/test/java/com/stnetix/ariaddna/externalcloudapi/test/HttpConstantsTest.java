package com.stnetix.ariaddna.externalcloudapi.test;

import static com.stnetix.ariaddna.externalcloudapi.HttpConstants.*;
import okhttp3.HttpUrl;
import org.junit.Assert;
import org.junit.Test;

public class HttpConstantsTest {
    @Test
    public void testConstructUrl(){
        HttpUrl url = new HttpUrl.Builder()
                    .scheme(HTTPS_SCHEME)
                    .host(YD_HOST)
                    .addPathSegment(YD_API_VER)
                    .addPathSegment(YD_ROOT)
                    .build();

        System.out.println(url.toString());

        Assert.assertEquals("https://cloud-api.yandex.net/v1/disk", url.toString());

    }
}
