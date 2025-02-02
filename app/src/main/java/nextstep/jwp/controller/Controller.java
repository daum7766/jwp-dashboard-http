package nextstep.jwp.controller;

import java.io.IOException;
import nextstep.jwp.http.Request;
import nextstep.jwp.http.Response;

public interface Controller {

    void service(Request request, Response response) throws IOException;
}
