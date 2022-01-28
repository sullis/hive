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

class ThriftHiveMetastore_get_part_specs_by_filter_result
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        0 => array(
            'var' => 'success',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\PartitionSpec',
                ),
        ),
        1 => array(
            'var' => 'o1',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\MetaException',
        ),
        2 => array(
            'var' => 'o2',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\NoSuchObjectException',
        ),
    );

    /**
     * @var \metastore\PartitionSpec[]
     */
    public $success = null;
    /**
     * @var \metastore\MetaException
     */
    public $o1 = null;
    /**
     * @var \metastore\NoSuchObjectException
     */
    public $o2 = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['success'])) {
                $this->success = $vals['success'];
            }
            if (isset($vals['o1'])) {
                $this->o1 = $vals['o1'];
            }
            if (isset($vals['o2'])) {
                $this->o2 = $vals['o2'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_get_part_specs_by_filter_result';
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
                case 0:
                    if ($ftype == TType::LST) {
                        $this->success = array();
                        $_size1622 = 0;
                        $_etype1625 = 0;
                        $xfer += $input->readListBegin($_etype1625, $_size1622);
                        for ($_i1626 = 0; $_i1626 < $_size1622; ++$_i1626) {
                            $elem1627 = null;
                            $elem1627 = new \metastore\PartitionSpec();
                            $xfer += $elem1627->read($input);
                            $this->success []= $elem1627;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->o1 = new \metastore\MetaException();
                        $xfer += $this->o1->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->o2 = new \metastore\NoSuchObjectException();
                        $xfer += $this->o2->read($input);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_get_part_specs_by_filter_result');
        if ($this->success !== null) {
            if (!is_array($this->success)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('success', TType::LST, 0);
            $output->writeListBegin(TType::STRUCT, count($this->success));
            foreach ($this->success as $iter1628) {
                $xfer += $iter1628->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->o1 !== null) {
            $xfer += $output->writeFieldBegin('o1', TType::STRUCT, 1);
            $xfer += $this->o1->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->o2 !== null) {
            $xfer += $output->writeFieldBegin('o2', TType::STRUCT, 2);
            $xfer += $this->o2->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
