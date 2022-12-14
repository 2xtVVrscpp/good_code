<?php
namespace HitPointServise;

class HitPoint{
    private static $HIT_POINT_MIN = 0;
    private static $HIT_POINT_MAX = 999;
    public int $_hitPointValue;

    function __construct(int $hitPointValue){
        if ($hitPointValue < Self::$HIT_POINT_MIN){
            return (Self::$HIT_POINT_MIN . '以上を指定してください');
        }

        if ($hitPointValue > Self::$HIT_POINT_MAX){
            return (Self::$HIT_POINT_MAX . '以下を指定してください');
        }

        $this->_hitPointValue = $hitPointValue;
        return ('データ格納');
    }

    // receve damage
    public function calcReceveDamage(int $damageAmount){
        $damaged = $this->_hitPointValue - $damageAmount;
        $corrected = $this->_hitPointValue < Self::$HIT_POINT_MIN ? Self::$HIT_POINT_MIN : $damaged;

        return new HitPoint($corrected);
    }
    
    // recover hitpoint
    public function calcRecoverHitPoint(int $recoveryAmount){
        $recoved = $this->_hitPointValue + $recoveryAmount;
        $corrected = $this->_hitPointValue > Self::$HIT_POINT_MAX ? Self::$HIT_POINT_MAX : $recoved;

        return new HitPoint($corrected);
    }
}