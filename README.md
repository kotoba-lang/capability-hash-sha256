# capability-hash-sha256

Atomic authority package for `hash/sha256`.

- imports: `#{:sha256-hex}`
- effects: `#{:crypto}`
- default policy: `:autonomous`
- semantic definition CID: `bafyreigj5lmdlxhxhlebacwoprr2hmqq24zwa45iiocbujuzqjvkkxvtpq`
- hash contract CID: `bafkreiflhj3fslsbh7okdas2fzlhmogai64x6p3lkla6gtr7berbp7ftvi`
- provider status: `contract-only`

The repository name is a discovery alias. The semantic definition CID
is the immutable import identity. Importing it does not grant runtime
authority: Tamaki must request it explicitly and Kototama must admit
the sealed envelope.

```sh
clojure -M:test
```
