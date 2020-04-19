package com.investmeinc.fs;

import com.investmeinc.fs.domain.tDAmeritrade.TDAmeritradeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;

@SpringBootApplication(scanBasePackages = "com.investmeinc.fs")
public class Application {

    private static HttpURLConnection connection;
    public static String access_Token = "Bearer oDNIvbnAPuXhZmCCjHeMMz8R6SB7sX6JTVgqslEWxbSb8ql86imUP3CUAWZeVnNvriJjqKWvUVUISC0GQfkiKVjrijZQ10VJA7NkPSqWmo44QdViPhGPukMux4okLtpltfqAux+mlZcb7DYugcVwmnh+YkGvK1fKe/ZDS/1AWvfAhFJslaXKPAdaZeUhA31I/toK5bXyi1IZeoMeuR8IVDtIlAcn1yXsrPl+ga63SoofWLfm59TiyyMYhykRdxm51kVRf2a1KCk/3sZ2I9depff0jLJfIHdeBkn4t7NnFp3SyuEoQewz+aLn4Ro+4LXDMdbyeAAAV191ttdwgwmRccDAPM8GaTcE6U9M+nG4PhyJ5DkntfdOd8LqSnbxRWzTrbAFzN9LALNKPshMdNLuVM1/vgeEbUrto6t9G7oW+J3P60PA8NbeJr9y4iOsNlnRfYVTn48gh2KSP7xF1B2B1AkQVGLWVv+WsBKR5WqMJwRDYX3vC8Y38vlQeH2Wg//4f4PsyOL+xS/NN8XsSeFwsCC+i/lvvew/7W7fBxRMv8JJ0V5H6100MQuG4LYrgoVi/JHHvlOpINe3BjrjLOHyYKlDhk3rZP/eYN22Pa4TPeCQj6gw5lUWrj/e3zUFa1DBF1KvcGnaa1tEv324iMjlBUZ97Vtg+Ihzno17FIkBDEVovScKeziT352iHwr/XACIUHCZvDGUnHdXDAV8VhgIRizccdbZHQgX55YKnJZNE2sEgibDl6sHxVSAVJE9WyHUmbAdgxlW6l7vl7diHHnPhimYoDZbJjXjEbdp3FA0o/iRhVE5io2SB40KV9rmrZjj4imTlRo16UbABHA0adx7PDpckOEWLXVY0QO8v2baFUOW5ThseNkAlKhPoHROmJro6rJN/PVDmpAXJ1nWMRfd7DxHZdddFw8BEIYcsMVXSuSn3zsin0U2e8DYfsJJK/2r0hgdddQrtt3X2/zXYAwCM+35yTBD06e8uFcOYIo5uYTgBIK7q8DMc6ggtg1B9oXkdIbFPb0/ZFqd93TQXH50K/cVf0EQ62aQSLM1CoqyX72SQarhJ3Celq53rVhN0oosPdWVr84yx7OIkTerg1IHA4nUj/qsJDb2BVDIEx/pHX4eGIkvg6kcWg==212FD3x19z9sWBHDJACbC00B75E";

    @Autowired
    private static RestTemplate restTemplate;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);

        //////////
//        Consuming TD Ameritrade API (using HttpURLConnection). Works beautifully : )
        //////////

//        BufferedReader reader;
//        String line;
//        StringBuilder resoponseContent = new StringBuilder();
//
//        try {
//            URL url = new URL("https://api.tdameritrade.com/v1/accounts/496763773");
//            connection = (HttpURLConnection) url.openConnection();
//
//            connection.setRequestMethod("GET");
//            connection.setConnectTimeout(5000);
//            connection.setReadTimeout(5000);
//            connection.setRequestProperty("Authorization", access_Token);
//
//            int status = connection.getResponseCode();
//            System.out.println(status);
//
//            if (status > 299) {
//                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
//                while ((line = reader.readLine()) != null) {
//                    resoponseContent.append(line);
//                }
//                reader.close();
//            } else {
//                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                while ((line = reader.readLine()) != null) {
//                    resoponseContent.append(line);
//                }
//                reader.close();
//            }
//            System.out.println(resoponseContent.toString());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            connection.disconnect();
//        }

        //////////
//        Consuming TD Ameritrade API (using OkHttptClient). Works beautifully : )
        //////////

//        OkHttpClient okHttpClient = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url("https://api.tdameritrade.com/v1/accounts/496763773")
//                .addHeader("Authorization", access_Token)
//                .build();
//
//        try {
//            Response response = okHttpClient.newCall(request).execute();
//            ResponseBody body = response.body();
//
//            int responseCode = response.code();
//            System.out.println(responseCode);
//
//            assert body != null;
//            String string = body.string();
//            System.out.println(string);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //////////
//        Consuming TD Ameritrade API (using RestTemplate). Works beautifully : )
        //////////

//        RestTemplate restTemplate = new RestTemplate();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", access_Token);
//
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//        ResponseEntity<TDAmeritradeResponse> response = restTemplate.exchange("https://api.tdameritrade.com/v1/accounts/496763773", HttpMethod.GET, entity, TDAmeritradeResponse.class);
//        TDAmeritradeResponse TDAmeritradeResponse = response.getBody();
//        assert TDAmeritradeResponse != null;
//        System.out.println(TDAmeritradeResponse.getSecuritiesAccount());

        //////////
//        Logging into Fidelity with Selenium (does not work, unable to login looks like Fidelity is blocking)
        //////////

//        System.setProperty("webdriver.chrome.driver", "/Users/michaelcarter/Downloads/chromedriver");
//        ChromeDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//
//        driver.navigate().to("https://digital.fidelity.com/prgw/digital/login/full-page?AuthRedUrl=https://oltx.fidelity.com/ftgw/fbc/ofsummary/defaultPage");
//        WebElement usernameInput = driver.findElementByXPath("//*[@id=\"userId-input\"]");
//        WebElement passwordInput = driver.findElementByXPath("//*[@id=\"password\"]");
//        WebElement loginButton = driver.findElementByXPath("//*[@id=\"fs-login-button\"]");
//
//        Thread.sleep(2000);
//
//        usernameInput.sendKeys("booboo0304");
//        passwordInput.sendKeys("Michael1!");
//        loginButton.click();

        //////////
//        Logging into E-trade with JSoup (does not work, get response but not the data I need)
        //////////

//        String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36";
//        String loginFormUrl =
//                "https://us.etrade.com/e/t/user/login";
//        String loginActionUrl =
//                "https://us.etrade.com/login?b";
//        String username = "booboo0304";
//        String password = "Michael1";
//
//        HashMap<String, String> cookies = new HashMap<>();
//        HashMap<String, String> formData = new HashMap<>();
//
//        try {
//            Connection.Response loginForm = Jsoup.connect(loginFormUrl).method(Connection.Method.GET).userAgent(USER_AGENT).execute();
//            cookies.putAll(loginForm.cookies()); // save the cookies, this will be passed on to next request
//
//
//            formData.put("USE_IDENTITY_TOKEN", "false");
//            formData.put("USER", username);
//            formData.put("PASSWORD", password);
//            formData.put("TARGET", "https://us.etrade.com/e/t/user/xfr?Target=/etx/hw/accountshome?cnt=header_logon_startin_accounts");
//            formData.put("iiXnANQ1pn-f", "A8sOQk9vAQAAl1mKX89cnY5UrxgwEEzNmbgLR1r_EWicVYHivLJpzT8scCS9AS-4OPGuctuUwH8AAOfvAAAAAA==");
//            formData.put("iiXnANQ1pn-b", "-ew39bw");
//            formData.put("iiXnANQ1pn-c", "AIDCKk9vAQAApK8cfBCtD8-Yi77FyJhLgBG6Dgv5TIvsTXFqt7VUn1Jsmi5L");
//            formData.put("iiXnANQ1pn-d", "o_0");
//            formData.put("iiXnANQ1pn-z", "p");
//            formData.put("iiXnANQ1pn-a", "V=gJfHpdypvvXLYtwIV=l-vZws=bNeAtfku52tBmdvl=CfHzFtFrNism4HjqIjKT7PJ66nrAeGgGH6cBjVs=BgGpd6rQF=Ny53pSUCNNfHBlT-p1VR_h3Ti4luRLl5AGKgn-55gvmMhQPloFVV54FmLvOts_k5DGc4ZzMNBUpvuKZQ5bu5wEd10qp3q2vfQ7=XpAE--HDirNp1ApICT8v_lpvm0Ir5BYLXp6YvstCneAJcqRSHqaDh=1K1vGMHV8Z5JY3RVCSHX0rinigqK5mLNLl12btOmSp8nQfnYHKwZGC2KTPcnEG5vW_rRFEUKk=5Cusm2CEGwRIyJ-sSnZVrXhKD7ub15j0P57Hd4J68WlvG8dyrX_vJa6A=eHzyFIAsPdM2AKQigOLs5j7td3p7QlA2va0mRlZL-FEr4goUCLeVRQe2cajkOedgz-PeUgP_QFYaNew6JhD1rPeQXcn2=0lhaRHQVHgOvIZF8z75yKp9Y2cN0DF8m8mMIJ40yadEkyF4T0hIO2QkGoLGja8XdCuIhpdyn9WIIKitTHkwlYgGffpJMfJg=AOZyNcEZzdG2zMKY8k93IbA1GOMdVzrYBHLLDum5zabLKuRW_alkBJkoNN-CgJ3tQe-eEBoS_vjo70uEmfewnpj23d4Uv6LITnpkJz48rJHnf=jJ7Ot2cvOoOsZa6F_Nvgk2S9v-gQ3Wpr2HWTDk6yEIpHfKr6EfAKHUwS7OF4zZeMjN9ZF6eI4Wev-CWv2Amg_PVJLD=mD_pCCEoXM6XWKlLgDkooAFX82dUWlzfe9Z0dyi8of-w3vpASFjymSeZk9tyTPS1JYMMvfXmQMUm6TZ2F4l_63VwjeWjzLAri1P-iwDyy0V3ISBiU1Ah3=zQdyXqqUESfOpfjPkdARUjuf9K0fDThsFeRdUl7wIO4n5f4Z2pwG7XPNt81fSXs92Z8-k6nyUyDGU3JMQ0c0Zh4cdkMLCOKhELT92vE5ZkbmFhmv8syw1yMprS2=FUWMB2dFQTlad7VEPvfF9ooq8s7eIVjBIKXKFDf9B-I-o_3RTzXhRYTHjlgrf=J=6jM=kZv9QDUQSudqqzh3bW=pgWMMS5-Xuj0fm1WS7JOkfHM2ke3t=RtM-FEKVDlI_13V37Z04XNnDC0gyW_MVJuLtYL5Iwa7aomp_U00FVeTvhP2HGbLDQg5J1giHje2Z6kArvaBARPu_jeI3tYDU1nFU2BgZp=mQQXTXbv1AcCT5Uv_1D2Ys3KSwC=gV6X0Dy7ZZOaJVG_BdAzHCF=9AG0jF1SGYQgyfE4PZGhyH0ITF1KRd12usbKauWHcnBI_QsUKjB50_jLJ-_4743LO2EwWcL9bXhgk6=iNBYe2c4iH8MSto-o7RI0qgYKzw4MnKiqQzwmfQrJNBNrPFYfeyOF4hf4=VSiZR7T4LZQpw_w=eS1VclC4P_w011f=SIpjBiK=yhHEONN7wThw7sghulwJDgyG9FbNJI762SrCWAN6STZfPGRdd8otOfWWBYu=nNQdFv4M9wLda8-=mtTwSAZy0h7vNNSV=1lDMV43KAreB=Hwpn-YZbp1RT82j_O1aMTjl16K5vde0OzusFFJb=RJeXbmY-gX8DGmj=vR8EyUvtMwbrAlod5DaLu_p5jdNXizpCjSUfmyica2nkJ4N9iYnqYNol8u129KK4B9oM5YvIhs2csDzQ9FN0cy=1_qBBnmK8HoYCnHBn-7oaKr=6XFfVMZqNI7fJDuhS0Y30F5dNwh_wZio2lznrhcwf32T2Wj5fjjVKuMN_T8Ryk9_Ur56bQ=1eEESG-4DgQ5tjnmX4X6LiR5twP8CyMoiIIMSCFaSWb0FdkTY=pRA7EL6h6HXR_UM_ZUSz4rzgP7_CWoX82igSrXVVXO0W49TPA3alr2Ulcz_g18-4EfB_O=rAeYlcGabclMKfzHPyUSeA=aFTDg0LcgJFor-vfFO8PoABYkdy6Hlsy2cIFUXt_r2Eff_rFHFN5po6XDU4k92UASJEEIJELDl-mDc_bnkDyUarSbM4H5ALpBiNY0Pq_72BeNClR0mLqajPasDL8TNo=GhalZb9SQ0ARaVMMNBsD0IYlBw=gT7CiZmnJNBYIssXh5RujY3uLP4kKgtfCrhJABoiNQMPpYBPsSRH86OvzOW79AwunY4Hw0t5OaJM8MjpKiDzVi02ZI=KnZDGYz2ZXYEGnq7F9AlubldPC5VO9TNPpPCBGeeYJUaqLcdbMo1GW1WXaBNr9lWMGyoMOvOGiyRH-Cq-GKN8rcL9k9Rqe2GCze=QZwtGgpoHTiy7b4ZIu_00UuQWHye1QbD8AX4eQGvW=z4qsupteV=8cQV=EXClBXz330Miu-lEfF=nJp8NmE1Djv8_r2=hHOjS0Wc4Y=oAN75GlsM3AaBIwG-Awtr7vJUKsqv-LqC9fhy84aZ7-g9ah_6YMBz66w1Yu7vsj49ge3Jh7dWujdiV4cA=Rpmk3gceRXrJWp614somhkv1Uw7kg02XSyq=Phqq8wOdQI2LHL=PCizdRgu_peQ8Nm2P6vB7aSacb8j98ZAe0nwP2OOmCz2wN=vHYRvb1EU15LFvinEC2CMsHV_sqmPrEjc3nkql5B6JSWNGV2eBj3Owp1AkKX2gAZGmAnUYVMZ5e06MKRSNBtr41awWzRqa0G-QXNqXRUt8O534KnWLkdQmsuho9-XQz5jJl0jQNbRO6D7RtJpKUs3epGcBlk0ofuXUT0bt0NMfucHSV7yM9mJlrQAQUIiaI133vM86Mqdmtlm71XlngfkT15CpYPt3kYfFRDLFR3omTlY8-gupK5ZzLzatUwfn8GTwlEXB5stkfLgYaRpZuO=rCpiaTblaU9V5NaVEcYwij8DcgY7CXEOlJqthfymRsFl92GiAC9m2CgqbipNHSNG57Hl2FgcaAR7t20Mvctq0haMCwqCAd_nXcCVCnel2cuFAXsoseTuYLLyPH6zyozmFSy7Il_Wb5KtCNdDqzHByJNMIUg_r=HtGW_Kfo9=zGvuqRRqFf9rvbhBLoBCsGYXI73U5V7YgCIApm48sWj4nA4HLXrXgo5Alss1eC=QcJXY9PyXz9jI20D0mV5RjDKfh2oZ6KFsl0uOj7Zv9a=ty3gsb8aF_TwIqqzU0J7o56PIVRr_u6m4AtAcH0ue1GW6os5lOQjk6fVQLNBAZqqozdFO6eFCUPbipjDhkHH-m-Tju9RE4hciHoH1cFOoIndwtrrVBLlJW_G1Q1M=sUUuJqrGSTYDRozaGdYaw1eCfOZ3cMUDAsjkC8b_4nYae4_Mvo4EZgaN3B0NL9jglANstIUKkV5MQ04YymqoApWp5BJ_aUQNnc09SRsINZ6mckG11n7luAWFKIdee5C_Wr=_s00pOHsKY1nXTLP0c9Hw-wX96Old5TjvLl7kuNCOZ29LcuVL8t7_zg-OO_kCVssVvQZyGAgILrjSg37mSi=vMGFWLEH7B=HwRdYvayz1_GWeGQZgI45RWoQzQqVV9nWXKqK20Ro0nMA75krD00O_BSNKjTdikw8WJbdDqO5COzy7_BQuYhUFZpT=NZVcQjhzlaUt-4W1hWRfrH86ywo7r07hj9SCNMwJsyPTJGTLHGeiquCHaiJG1-HZ-KFEX50HaIuSocVAUDV08W5yjZNSv=HR9bulXI_RVZ5DOT4NW__-pjeq=R8JY4DaiUkJIas7T2Cy8lwYn8PWCcOLv-LO=OTAbfnpJa-KbQJ_rQpaD5CFjSXZf=89IJQ5nqT5hdzNBNg7C_=YF8kzdtbSYwkLmL4049QAmAZG3Qm4PzjDjOnc3yNFnyc6hNTN=6BGHk5Syra_014WWkzS4=bH8=NJSOJQ8BwiC6o9prLg21b0TRKyZovU6ggIctkfkbHezC4=SDz0li7JBoPHCkFWiM52S1rCY7A5RUqRUGZvqwWHLQSReCZLq2rQdo6EF86qa5US9QQwvVqT7zzwj_DHHqFb8gCDzY-VlaFVt8jMGucIaDBqT3nkOeLew3bsm44ZQcp-nO=_f7_sYV0u0bMDNI2uAh9HHgeuuI63O=sIDIuAmKqPh209E4aEbZJFC47CL88e7MU5u4F2Qn4jSlQ25Xu_EFB6EFmscTAlmdjc-QLA-ug0ZQO6S8=jRb74F7q5Lk3-IdceOicKpYQou77qgczReBOOMcV0f=Tu--zTLaeMrqYi0auDQnnubcc4zQcUksw0MIA-ELS=g-9GcBSUwm_8=RzKenOAJk1yoWkFYrQFB4Bgw9zPeHd-GnjnaTInJW1SvrCnVggSBHFsue0lUn4r6Jq4YfXIeJ=aDKGat6ezmQp8EBCg44YsGC8TspZ=o=bv038IyIBzBpnUJiq7bUpO2XW52lWyE-VT_=oI5gn_BzGXvw_3irtwNdwT-7uI0Fh=gm-NmbEWfaU7tgmaKF0XpyGaHASY_-Jj_vAKe_6VVSPgKMK4s95XblOonwwAh-1llSnhJi-thQ06uWeufCJSt5ljvO4byETQNEbWrziV6PJZJp8UCwSIv5Y9o6UvyQRyjE=7tbtI2zZuWBSX6yRt5=B5aSJoL0hKIOSigSJHWyYMNhB51bXvDrLno-2Sy2vPULRY76uy3=0KIFH1AuTr-5rIeYaU4z88EhVqAfAFM31b1vhZ-i3ynuNG0AWmaaM=e0=BrkCQ5icnmoUoPz=Dzm=gwWl=ASWezsokWp226HmOHHnwIQEjq2Lr3lAn35p5QRBjf_yuh7AFpYJC-zE=PKPUB5A0_3OtIEtTqVIGi9yUHhSI4g27iKG=_bEuGZguMRmzFRKoT6RuYh6spMdJHKYcmUG6n8QjHaOeXCXDkodSzPZryBD5nimGFYS7E9F-j_gSaYeTcWiGH_tN0=HQRN9LzEJ-oJisJKwmjUKcLpODFItf=bi9NJnNrYq3Q0bhp_u4VgO2s1nSsX98eWJb9QMi5jWgChwGLQacDn3V8QZdJnoQXUL3Izrv7OtwCGkdBMEjyD2F99lX5C24ouhmbCkoC3rI5mZuG-FaTNs9QDAptIqJJi=szfVOKTeuJr9NW-Ov2Qk_FTY5Wpb_lq0BDYKJiOPU1bYqYNo1rziNq5MHsuH1ELTpqf5a4reGkMOYzwrIgWqBQCoBNMt=rjmvym=7zwVA=mL1JOTun0f-v8SR6azfX10H=CcXqlVFJFQ42lLTzk=70B5kDuPUPDZkDBfHzB3tU-LmhNpy9lp-HkSYMFXL=DsgXKYgyYnV8_Y_12zImsseKtwMVgGM0h-vLDRrfs5sGuUpP=ctYUTcanRvBkKhYZOsGeIIaSrsLgsSZ_GAp3UPtoI8O-A1rBoaPptkS5sK1GTZL4IEw7iNhiYpEA2bT=pnWBVlCNKSzRMwSFAq59--QU_5eKocuqvtlukFT7JXNz4CK=1bQwtMq2PTjyq=lhKOBRX1uaKCjUkNpH3eA3aYVc8U42uuChL_fZ-lbkEnKQd_aJgnt0ZwYMG_cd5KTGhdR4UJfDD4TA1nW2saHBgU9OQNzFVL4EAkV0TW7QGON15dmWzDQ3z9IpY8aKG_Ju5Efz83_R4BY0Pu=Z4fD-Yfzrv6VAVattZE8EcZl=pR7aaNBchGhXKsgb=MGtW3hHh-LK7zaWCJ5COdnkzcevpNO-LNKm9nv64UbT3qrtzRmGKf5pZzWAj7Lv3gB4ME2Hh01EhNn9ZAV=aOLHc0Q=7MUlHdtKeGrkbC3i3X2AlA534rSb_9VFgq3K8b-IdMZ66wBYmAnVgj5HZXtnBHi1v86pJUSSqZke9HE6RCDaG2Q57IOi_6U7gGd7Pc5tF=G3ZtBckgveoD=VP2kgUu7EPLjRmUsOviyIe5KvUCdL_OmS7H4MTLvG8GOLJfSVoUn6vJerzNBcTrH5qVYXWHupNG8tDlNy7COIiBj7V903U2lOU=IlXsyv2zaZml4yKw0uMGAQeW-N=kPoO=4dPqtK7bNByiNytAw4nYNaQZ-Bam6tnfQ5myHhNNyrcYXYNFO4FBmDkeuQ6zmNf0");
//
//            Connection.Response homePage = Jsoup.connect(loginActionUrl)
//                    .cookies(cookies)
//                    .data(formData)
//                    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
//                    .header("Accept-Encoding", "gzip, deflate, br")
//                    .header("Cache-Control", "max-age=0")
//                    .header("Connection", "keep-alive")
//                    .header("Content-Type", "application/x-www-form-urlencoded")
//                    .method(Connection.Method.POST)
//                    .userAgent(USER_AGENT)
//                    .execute();
//
//            System.out.println(homePage.parse().html());
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }



//        final String url = "https://finance.yahoo.com/";
//
//        try {
//            final Document document = Jsoup.connect(url).get();
//
//            System.out.println(document.html());
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
