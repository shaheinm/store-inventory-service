package com.instore.inventory_service;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Future<Void> fut) throws Exception {
    vertx
      .createHttpServer()
      .requestHandler(req -> {
        req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x!");
    }).listen(config()
      .getInteger("HTTP_PORT", 8080),
      result -> {
        if (result.succeeded()) {
          fut.complete();
          System.out.println("HTTP server started on port 8080");
        } else {
          fut.fail(result.cause());
        }
    });
  }
}
