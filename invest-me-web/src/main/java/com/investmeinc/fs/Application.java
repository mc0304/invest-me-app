package com.investmeinc.fs;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication(scanBasePackages = "com.investmeinc.fs")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36";
        String loginFormUrl =
                "https://digital.fidelity.com/prgw/digital/login/full-page?AuthRedUrl=https://oltx.fidelity.com/ftgw/fbc/ofsummary/defaultPage";
        String loginActionUrl =
                "https://login.fidelity.com/ftgw/Fas/Fidelity/RtlCust/Login/Response/dj.chf.ra?AuthRedUrl=https%3A%2F%2Foltx.fidelity.com%2Fftgw%2Ffbc%2Fofsummary%2FdefaultPage";
        String username = "<username>";
        String password = "<password>";

        HashMap<String, String> cookies = new HashMap<>();
        HashMap<String, String> formData = new HashMap<>();

        try {
            Connection.Response loginForm = Jsoup.connect(loginFormUrl).method(Connection.Method.GET).userAgent(USER_AGENT).execute();
            Document loginDoc = loginForm.parse(); // this is the document that contains response html
            cookies.putAll(loginForm.cookies()); // save the cookies, this will be passed on to next request

            formData.put("DEVICE_PRINT", "version=3.5.2_2&pm_fpua=mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/79.0.3945.88 safari/537.36|5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36|MacIntel&pm_fpsc=24|2560|1440|1353&pm_fpsw=&pm_fptz=-6&pm_fpln=lang=en-US|syslang=|userlang=&pm_fpjv=0&pm_fpco=1&pm_fpasw=internal-pdf-viewer|mhjfbmdgcfjbbpaeojofohoefgiehjai|internal-nacl-plugin&pm_fpan=Netscape&pm_fpacn=Mozilla&pm_fpol=true&pm_fposp=&pm_fpup=&pm_fpsaw=2560&pm_fpspd=24&pm_fpsbd=&pm_fpsdx=&pm_fpsdy=&pm_fpslx=&pm_fpsly=&pm_fpsfse=&pm_fpsui=&pm_os=Mac&pm_brmjv=79&pm_br=Chrome&pm_inpt=&pm_expt=");
            formData.put("SSN", username);
            formData.put("SavedIdInd", "N");
            formData.put("PIN", password);

            Connection.Response homePage = Jsoup.connect(loginActionUrl)
                    .cookies(cookies)
                    .data(formData)
                    .method(Connection.Method.POST)
                    .userAgent(USER_AGENT)
                    .execute();

            System.out.println(homePage.parse().html());
        }
        catch(Exception e){
            e.printStackTrace();
        }



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
