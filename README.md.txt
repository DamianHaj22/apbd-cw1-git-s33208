# Projekt APBD - Git

ZAD_5
Dlaczego merge nie był fast-forward?
Merge nie był fast-forward, ponieważ po utworzeniu gałęzi `feature-max`,
na gałęzi `main` pojawił się nowy, niezależny commit,
dlatego Git musiał utworzyć 'merge commit', aby je połączyć, bo się rozeszły


Hello world

ZAD_6
Różnica między Merge a Rebase
Merge: zachowuje dokładną, historyczną linię czasu. 
Jeśli gałęzie się rozeszły, tworzy nowy 'merge commit' i je łączy

Rebase: przepisuje historię. Odrywa commity z naszej gałęzi i dokleja je na samym końcu gałęzi docelowej. 
Dlatgeo jest chronologicznie