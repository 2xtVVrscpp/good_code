<?php
require_once __DIR__ . '/HitPoint.php';


$personAaaHitpoint = new HitPointServise\HitPoint(90);
echo 'personAaa : ' . $personAaaHitpoint->_hitPointValue . "\n";

$personAaaHitpoint = $personAaaHitpoint->calcReceveDamage(10);
echo 'personAaa : ' . $personAaaHitpoint->_hitPointValue . "\n";

$personAaaHitpoint = $personAaaHitpoint->calcRecoverHitPoint(20);
echo 'personAaa : ' . $personAaaHitpoint->_hitPointValue . "\n";
