<?php
session_start();
session_destroy();

echo "
<script> location.href='../';
</script>
";

echo "Session destroy!.";
echo "<br>";
echo "<a href='../'>Home</a>";
?>