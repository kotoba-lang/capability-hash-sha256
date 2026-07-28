# capability-hash-sha256

Atomic authority package for `hash/sha256`.

- imports: `#{:sha256-hex}`
- effects: `#{:crypto}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
