package com.investmeinc.fs.services.tDAmeritrade;

import com.investmeinc.fs.domain.tDAmeritrade.SecuritiesAccount;
import com.investmeinc.fs.domain.tDAmeritrade.TDAmeritradeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/td")
public class TDAmeritradeGetAccountServiceImpl {

    public String access_Token = "Bearer TXbeTIa+IT5KTVHv8FK+w+LPn15dfm+AJWQtVvyEMRpDpIccpGD7FJ686WZ37QIxUv6TY9kHwfxQNOELsOZb6QpaqecxBIj4+8T3YOh/BcOWrQOaPyp6Vzfh854+UaTG61ObLpTf+FQu5RO6DmKelo1LrWhPYqGPuEjxcuY9Lb5ALcNSTPqHpb2E0Ohan0NicY1hsoLcRNSQTm7l2VkgijO9b07zZVSNIJw1oBhR+pBbUzbkJRJax49eVSflr48fv+2EVO9wmal33zexmdvgMcJPIx58KxczPQxXkmiCMW/Gv7tNS/pyXNu1xbUqUMz84aAviEnKMRZeR7KQTotmu9D0Ww2kq4uxUQnPMweHq30JvYGf+OwLzRzI5/xCEsLz79ri9/v1iCVEzuifTDqxAeQvOmqxkqsfk7Q7nrboXo5sP3JF0RDi+QMP9rPjtm2D9C6l3IZkYcBjHPSliE+ZPDIlaMpA4bb8BO1SXZpECrcGOrm5O2DMSASkOvo6znGyjrR/PdfuNDzsXPGWCxBnT4vKpyivcsUAW6jmmONM4E0n4HHP4100MQuG4LYrgoVi/JHHvlZa3gaAwLkN39pg8KoM4sgQWEE37hwtnwp8891NQ/kTnFFXcQhnDU4OtJ63363Yuzdc8po6KP/kkwD+/LACsD9qspI8siTXeeOFVSWA1spzgunVMZlI0JDQQfpAgUnlhfWynArzyg0DPBhPkPDSoKduS7bQDy/Hhnouy74PTdJyv8nEsBmGj6g3chimsEf588YXI8n3gpNVwUt6KdhnWAgor97UNxljKJJ2GnKNTPLL/Pr8l/XAbAQk2mgDRH8YIGnzYAeJ7NicV4TvexmVi2iC9MC36A27kR5UjDbKSrNBa87PGo7rW3mIxK+fjgHmr74ujji/pdD4fHNXg39eL8ZNwUC5Mj52pEAKYU5YlV6kWzvLORiaGE2I6d4UTP8G6kmXDvOKM5lsdGgjNSrLsoad8+Tuyc+DWrtvycBei2XRFIy4dJsfmy5ezRc+FKQXS0PdcH1Y+BcT9RwJz43btky/dhhPomjAOHexOAeuX727kpk6mgkqA6W63PG5jm0jUlgagWLn+IeAm6GbASOqAVlVM/uEF9hjH1cfmRlvUAtgImceWQ==212FD3x19z9sWBHDJACbC00B75E";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getaccounts")
    public TDAmeritradeResponse getTDAccount() {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", access_Token);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<TDAmeritradeResponse> response = restTemplate.exchange("https://api.tdameritrade.com/v1/accounts/496763773", HttpMethod.GET, entity, TDAmeritradeResponse.class);
        TDAmeritradeResponse TDAmeritradeResponse = response.getBody();
        assert TDAmeritradeResponse != null;
        System.out.println(TDAmeritradeResponse);

        return TDAmeritradeResponse;
    }
}
