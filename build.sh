cp swagger.yaml ./docs/
swagger-codegen generate -i swagger.yaml  -l python -o client/python
# swagger-codegen generate -i swagger.yaml  -l java -o client/java
# swagger-codegen generate -i swagger.yaml  -l ruby -o client/ruby
# swagger-codegen generate -i swagger.yaml  -l go -o client/go
# swagger-codegen generate -i swagger.yaml  -l php -o client/php
# swagger-codegen generate -i swagger.yaml  -l perl -o client/perl
# swagger-codegen generate -i swagger.yaml  -l javascript -o client/javascript
# swagger-codegen generate -i swagger.yaml  -l csharp -o client/csharp
# swagger-codegen generate -i swagger.yaml  -l swift -o client/swift

