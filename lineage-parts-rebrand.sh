#!/bin/bash
grep -rl "org\.crdroid" app/. | xargs sed -i 's/org\.crdroid/com\.fluentproject/g'
