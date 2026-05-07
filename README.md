# liquid-java.github.io

Source for the [LiquidJava](https://github.com/liquid-java) project website, served via GitHub Pages from `main`.

## Local preview

No build step, no package manager. Open `index.html` directly, or serve the directory:

```sh
python3 -m http.server 8000
# then visit http://localhost:8000
```

## Structure

- `index.html` — single-page site (markup, content, and inline JS for navbar + theme toggle).
- `assets/css/style-starter.css` — vendored W3layouts template stylesheet plus LiquidJava overrides. Theme rules layered via `.light-theme` / `.dark-theme` on `<body>`.
- `assets/js/jquery-3.3.1.min.js` — only JS dependency.
- `assets/images/`, `assets/docs/`, `assets/extension/` — static assets (images, poster PDF, VSCode `.vsix`).

## Theme toggle

Dark/light mode is toggled by inline JS at the bottom of `index.html`. The selected theme is persisted in `localStorage` under the `theme` key and applied as a class on `<body>` before `DOMContentLoaded` to avoid a flash of unstyled content. When adding new sections, add explicit color rules for both themes in `style-starter.css`.

## Deploying

Push to `main`. GitHub Pages publishes the site automatically.

## Related repositories

- [`liquidjava`](https://github.com/liquid-java/liquidjava) — verifier, API, examples
- [`liquidjava-docs`](https://github.com/liquid-java/liquidjava-docs) — documentation
- [`liquidjava-tutorial`](https://github.com/liquid-java/liquidjava-tutorial) — tutorial
- [`vscode-liquidjava`](https://github.com/liquid-java/vscode-liquidjava) — VSCode extension
