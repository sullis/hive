<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class AddPartitionsResult
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'partitions',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\Partition',
                ),
        ),
        2 => array(
            'var' => 'isStatsCompliant',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var \metastore\Partition[]
     */
    public $partitions = null;
    /**
     * @var bool
     */
    public $isStatsCompliant = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['partitions'])) {
                $this->partitions = $vals['partitions'];
            }
            if (isset($vals['isStatsCompliant'])) {
                $this->isStatsCompliant = $vals['isStatsCompliant'];
            }
        }
    }

    public function getName()
    {
        return 'AddPartitionsResult';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->partitions = array();
                        $_size526 = 0;
                        $_etype529 = 0;
                        $xfer += $input->readListBegin($_etype529, $_size526);
                        for ($_i530 = 0; $_i530 < $_size526; ++$_i530) {
                            $elem531 = null;
                            $elem531 = new \metastore\Partition();
                            $xfer += $elem531->read($input);
                            $this->partitions []= $elem531;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->isStatsCompliant);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('AddPartitionsResult');
        if ($this->partitions !== null) {
            if (!is_array($this->partitions)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('partitions', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->partitions));
            foreach ($this->partitions as $iter532) {
                $xfer += $iter532->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->isStatsCompliant !== null) {
            $xfer += $output->writeFieldBegin('isStatsCompliant', TType::BOOL, 2);
            $xfer += $output->writeBool($this->isStatsCompliant);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
